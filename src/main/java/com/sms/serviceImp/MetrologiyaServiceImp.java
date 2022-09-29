package com.sms.serviceImp;

import com.sms.model.MetrologiyaModel;
import com.sms.model.VagonModel;
import com.sms.repository.MetrologiyaRepository;
import com.sms.service.MetrologiyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class MetrologiyaServiceImp implements MetrologiyaService {
    @Autowired
    MetrologiyaRepository metrologiyaRepository;

    @Override
    public List<MetrologiyaModel> findAll() {
        return metrologiyaRepository.findAll();
    }

    @Override
    public List<MetrologiyaModel> findAllByDepoNomi(String depoNomi) {
        return metrologiyaRepository.findAllByDepoNomi(depoNomi);
    }

    @Override
    public MetrologiyaModel saveTemplate(MetrologiyaModel metrologiyaModel) {
        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(metrologiyaModel.getId());
        if (exists.isPresent() ||  metrologiyaModel.getNomi() == null)
            return new MetrologiyaModel();
        MetrologiyaModel savedShablon = new MetrologiyaModel();
        savedShablon.setNomi(metrologiyaModel.getNomi());
        savedShablon.setSoni(metrologiyaModel.getSoni());
        savedShablon.setRaqami(metrologiyaModel.getRaqami());
        savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
        savedShablon.setTuri(metrologiyaModel.getTuri());
        savedShablon.setIshi(metrologiyaModel.getIshi());
        savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
        savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
        savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
        savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
        savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
        savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
        savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
        savedShablon.setIzoh(metrologiyaModel.getIzoh());
        savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());

        return metrologiyaRepository.save(savedShablon);
    }

    @Override
    public MetrologiyaModel saveTemplateSam(MetrologiyaModel metrologiyaModel) {

        if(metrologiyaModel.getNomi() == null)
            return new MetrologiyaModel();
        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(metrologiyaModel.getId());
        if (exists.isPresent() || !metrologiyaModel.getDepoNomi().equalsIgnoreCase("VCHD-6") || metrologiyaModel.getNomi() == null)
            return new MetrologiyaModel();

        MetrologiyaModel savedShablon = new MetrologiyaModel();
        savedShablon.setNomi(metrologiyaModel.getNomi());
        savedShablon.setSoni(metrologiyaModel.getSoni());
        savedShablon.setRaqami(metrologiyaModel.getRaqami());
        savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
        savedShablon.setTuri(metrologiyaModel.getTuri());
        savedShablon.setIshi(metrologiyaModel.getIshi());
        savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
        savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
        savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
        savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
        savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
        savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
        savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
        savedShablon.setIzoh(metrologiyaModel.getIzoh());
        savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());

        return metrologiyaRepository.save(savedShablon);
    }

    @Override
    public MetrologiyaModel saveTemplateHav(MetrologiyaModel metrologiyaModel) {

        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(metrologiyaModel.getId());
        if (exists.isPresent() || !metrologiyaModel.getDepoNomi().equalsIgnoreCase("VCHD-3") || metrologiyaModel.getNomi() == null)
            return new MetrologiyaModel();
        MetrologiyaModel savedShablon = new MetrologiyaModel();
        savedShablon.setNomi(metrologiyaModel.getNomi());
        savedShablon.setSoni(metrologiyaModel.getSoni());
        savedShablon.setRaqami(metrologiyaModel.getRaqami());
        savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
        savedShablon.setTuri(metrologiyaModel.getTuri());
        savedShablon.setIshi(metrologiyaModel.getIshi());
        savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
        savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
        savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
        savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
        savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
        savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
        savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
        savedShablon.setIzoh(metrologiyaModel.getIzoh());
        savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());

        return metrologiyaRepository.save(savedShablon);
    }

    @Override
    public MetrologiyaModel saveTemplateAndj(MetrologiyaModel metrologiyaModel) {

        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(metrologiyaModel.getId());
        if (exists.isPresent() || !metrologiyaModel.getDepoNomi().equalsIgnoreCase("VCHD-5") || metrologiyaModel.getNomi() == null)
            return new MetrologiyaModel();
        MetrologiyaModel savedShablon = new MetrologiyaModel();
        savedShablon.setNomi(metrologiyaModel.getNomi());
        savedShablon.setSoni(metrologiyaModel.getSoni());
        savedShablon.setRaqami(metrologiyaModel.getRaqami());
        savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
        savedShablon.setTuri(metrologiyaModel.getTuri());
        savedShablon.setIshi(metrologiyaModel.getIshi());
        savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
        savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
        savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
        savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
        savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
        savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
        savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
        savedShablon.setIzoh(metrologiyaModel.getIzoh());
        savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());

        return metrologiyaRepository.save(savedShablon);
    }

    @Override
    public MetrologiyaModel getShablonById(Integer id) {
        Optional<MetrologiyaModel> optional = metrologiyaRepository.findById(id);
        if (optional.isPresent())
            return optional.get();
        return new MetrologiyaModel();

    }

    @Override
    public void updateShablon(MetrologiyaModel metrologiyaModel, Integer id) {
        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(id);
        if (exists.isPresent() && metrologiyaModel.getNomi() != null) {

            MetrologiyaModel savedShablon = exists.get();
            savedShablon.setNomi(metrologiyaModel.getNomi());
            savedShablon.setSoni(metrologiyaModel.getSoni());
            savedShablon.setRaqami(metrologiyaModel.getRaqami());
            savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
            savedShablon.setTuri(metrologiyaModel.getTuri());
            savedShablon.setIshi(metrologiyaModel.getIshi());
            savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
            savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
            savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
            savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
            savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
            savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
            savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
            savedShablon.setIzoh(metrologiyaModel.getIzoh());
            savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());
            metrologiyaRepository.save(savedShablon);
        }
    }

    @Override
    public void updateShablonSam(MetrologiyaModel metrologiyaModel, Integer id) {
        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(id);
        if (exists.isPresent() && metrologiyaModel.getNomi() != null && metrologiyaModel.getDepoNomi().equalsIgnoreCase("VCHD-6")
                && exists.get().getDepoNomi().equalsIgnoreCase("VCHD-6") ) {

            MetrologiyaModel savedShablon = exists.get();
            savedShablon.setNomi(metrologiyaModel.getNomi());
            savedShablon.setSoni(metrologiyaModel.getSoni());
            savedShablon.setRaqami(metrologiyaModel.getRaqami());
            savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
            savedShablon.setTuri(metrologiyaModel.getTuri());
            savedShablon.setIshi(metrologiyaModel.getIshi());
            savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
            savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
            savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
            savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
            savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
            savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
            savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
            savedShablon.setIzoh(metrologiyaModel.getIzoh());
            savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());
            metrologiyaRepository.save(savedShablon);
        }
    }

    @Override
    public void updateShablonHav(MetrologiyaModel metrologiyaModel, Integer id) {
        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(id);
        if (exists.isPresent() && metrologiyaModel.getNomi() != null && metrologiyaModel.getDepoNomi().equalsIgnoreCase("VCHD-3")
                && exists.get().getDepoNomi().equalsIgnoreCase("VCHD-3") ) {

            MetrologiyaModel savedShablon = exists.get();
            savedShablon.setNomi(metrologiyaModel.getNomi());
            savedShablon.setSoni(metrologiyaModel.getSoni());
            savedShablon.setRaqami(metrologiyaModel.getRaqami());
            savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
            savedShablon.setTuri(metrologiyaModel.getTuri());
            savedShablon.setIshi(metrologiyaModel.getIshi());
            savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
            savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
            savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
            savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
            savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
            savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
            savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
            savedShablon.setIzoh(metrologiyaModel.getIzoh());
            savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());
            metrologiyaRepository.save(savedShablon);
        }
    }

    @Override
    public void updateShablonAndj(MetrologiyaModel metrologiyaModel, Integer id) {
        Optional<MetrologiyaModel> exists = metrologiyaRepository.findById(id);
        if (exists.isPresent() && metrologiyaModel.getNomi() != null && metrologiyaModel.getDepoNomi().equalsIgnoreCase("VCHD-5")
                && exists.get().getDepoNomi().equalsIgnoreCase("VCHD-5") ) {

            MetrologiyaModel savedShablon = exists.get();
            savedShablon.setNomi(metrologiyaModel.getNomi());
            savedShablon.setSoni(metrologiyaModel.getSoni());
            savedShablon.setRaqami(metrologiyaModel.getRaqami());
            savedShablon.setIshlabChiqarilganYili(metrologiyaModel.getIshlabChiqarilganYili());
            savedShablon.setTuri(metrologiyaModel.getTuri());
            savedShablon.setIshi(metrologiyaModel.getIshi());
            savedShablon.setSaqlanishJoyi(metrologiyaModel.getSaqlanishJoyi());
            savedShablon.setSerRaqamiSanasi(metrologiyaModel.getSerRaqamiSanasi());
            savedShablon.setSerBerganKorxona(metrologiyaModel.getSerBerganKorxona());
            savedShablon.setSarflanganMablag(metrologiyaModel.getSarflanganMablag());
            savedShablon.setSerKeyingiSanasi(metrologiyaModel.getSerKeyingiSanasi());
            savedShablon.setSerDavriyligi(metrologiyaModel.getSerDavriyligi());
            savedShablon.setShartnomaRaqamiSanasi(metrologiyaModel.getShartnomaRaqamiSanasi());
            savedShablon.setIzoh(metrologiyaModel.getIzoh());
            savedShablon.setDepoNomi(metrologiyaModel.getDepoNomi());
            metrologiyaRepository.save(savedShablon);
        }
    }

    @Override
    public void deleteTemplateById(Integer id) {
        metrologiyaRepository.deleteById(id);

    }

    @Override
    public void deleteTemplateSam(Integer id) {
        Optional<MetrologiyaModel> optional = metrologiyaRepository.findById(id);
        if (optional.isPresent() && optional.get().getDepoNomi().equals("VCHD-6"))
            metrologiyaRepository.deleteById(id);
    }

    @Override
    public void deleteTemplateHav(Integer id) {
        Optional<MetrologiyaModel> optional = metrologiyaRepository.findById(id);
        if (optional.isPresent() && optional.get().getDepoNomi().equals("VCHD-3"))
            metrologiyaRepository.deleteById(id);
    }

    @Override
    public void deleteTemplateAndj(Integer id) {
        Optional<MetrologiyaModel> optional = metrologiyaRepository.findById(id);
        if (optional.isPresent() && optional.get().getDepoNomi().equals("VCHD-5"))
            metrologiyaRepository.deleteById(id);
    }
}
